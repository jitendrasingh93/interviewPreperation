package spring.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JitendraSingh on 24/01/19.
 */
public class ExchangeDemo {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        String uri = "http://localhost:8080/UserManagement/rest/UserService/users";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //headers.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

        HttpEntity<String> entity = new HttpEntity<String>("Hello World!", headers);
        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
        Map<String, String> queryParamsMap = new HashMap<>();

        requestBody.setAll(queryParamsMap);

        ResponseEntity<String> personEntity = restTemplate.exchange(uri, HttpMethod.GET,
                new HttpEntity<MultiValueMap<String, String>>(requestBody, headers), String.class);


        //String xml = prettyPrintXML(personEntity.getBody());
        String json = prettyPrintJSON(personEntity.getBody());
        System.out.println(json);
        /*System.out.println("ID:" + personEntity.getBody().getId());
        System.out.println("Name:" + personEntity.getBody().getName());
        System.out.println("Village:" + personEntity.getBody().getAddress().getVillage());*/
    }

    private static String prettyPrintXML(final String uglyResponse) {
        try (final Writer output = new StringWriter()) {
            final Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(new DOMSource(getXMLDocument(uglyResponse)), new StreamResult(output));
            return output.toString();
        } catch (TransformerException | ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return uglyResponse;
    }

    private static String prettyPrintJSON(final String uglyResponse) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            final Object json = mapper.readValue(uglyResponse, Object.class);
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
        } catch (final IOException e) {
            System.out.println(""+e+ " Error in Prettifying JSON Response");
        }
        return uglyResponse;
    }

    private static org.w3c.dom.Document getXMLDocument(final String uglyResponse)
            throws SAXException, IOException, ParserConfigurationException {
        try (final InputStream inputStream = new ByteArrayInputStream(uglyResponse.getBytes())) {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setValidating(false);
            final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            return documentBuilder.parse(inputStream);
        } catch (SAXException | IOException | ParserConfigurationException e) {
            throw e;
        }
    }

}