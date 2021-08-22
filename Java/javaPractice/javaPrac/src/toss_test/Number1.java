package toss_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import java.util.stream.Collectors;

public class Number1 {

    // 이 함수는 수정하지 마세요.
    public String[] solution(String[] data) {
        return Arrays.stream(data).map(input -> {
            return parse(input).toString();
        }).toArray(String[]::new);
    }

    // 이 함수를 구현해주세요.
   public Uri parse(String input) {
	
	 int pos1 = input.indexOf(":");
	 int pos2 = input.indexOf("/", pos1+3);
	 int pos3 = input.indexOf("?");
	 
	 String scheme = input.substring(0,pos1+1);
	 String host = "";
	 String path ="";
	 String query = "";
	 
	 if(pos2 != -1) {
	 host = input.substring(pos1+3,pos2);
		 
	 if(pos3!=-1) {
		 path = input.substring(pos2,pos3);
	 	query = input.substring(pos3+1, input.length());
    }
	 else {
		 path = input.substring(pos2+1,input.length());
	 }
	 
	 }
	 else {
		 host = input.substring(pos1+3,input.length());
	 }
	 Map<String, String> h = new HashMap<String, String>();
	 
	 if(query != "") {
		 
		 String queries[] = query.split("&");
		 for(String q : queries) {
			 String data[] = q.split("=");
			 h.put(data[0], data[1]);
			 
		 }
	 }
	 Uri uri = new Uri(scheme, host, path, h);
	 
	 return uri;
    }

    // 이 클래스는 수정하지 않아도 됩니다.
    static class Uri {
        private String scheme;
        private String host;
        private String path;
        private Map<String, String> query;

        public Uri(String scheme, String host, String path, Map<String, String> query) {
            this.scheme = scheme;
            this.host = host;
            this.path = path;
            this.query = query;
        }

        public String getScheme() {
            return scheme;
        }

        public void setScheme(String scheme) {
            this.scheme = scheme;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Map<String, String> getQuery() {
            return query;
        }

        public void setQuery(Map<String, String> query) {
            this.query = query;
        }


        @Override
        public String toString() {
            StringBuilder queryBuilder = new StringBuilder();
            queryBuilder.append("{");
            if (query != null) {
                String pair = query.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .map(entry -> String.format("%s=%s", entry.getKey(), entry.getValue()))
                        .collect(Collectors.joining(", "));
                queryBuilder.append(pair);
            }
            queryBuilder.append("}");
            return String.format(
                    "Uri(scheme=%s, host=%s, path=%s, query=%s)",
                    scheme != null ? scheme : "",
                    host != null ? host : "",
                    path != null ? path : "",
                    queryBuilder.toString());
        }
    }
}
