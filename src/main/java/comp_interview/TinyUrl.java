package comp_interview;

import java.math.BigInteger;

/**
 * Created by JitendraSingh on 17/05/18.
 */
public class TinyUrl {

        public String idToTinyUrl(long id)
        {
            String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder tinyUrl = new StringBuilder();
            while(id>0)
            {
                tinyUrl.append(map.charAt((int) (id%62)));
                //id /= 62;
                id = id/62;
            }
            return tinyUrl.reverse().toString();
        }

        public long tinyUrlToId(String tinyUrl)
        {
            long id = 0;
            String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            for(int i=0;i<tinyUrl.length();i++)
            {
                id = (id*62) + map.indexOf(tinyUrl.charAt(i));
            }
            return id;
        }

        public static void main(String args[]) {
            Long l = Long.valueOf(1227223235);
            long id = 133956910;
            String url = "jeetusingh";
            TinyUrl t = new TinyUrl();
            System.out.println(t.idToTinyUrl(id));
            System.out.println(t.tinyUrlToId(url));
        }
}
