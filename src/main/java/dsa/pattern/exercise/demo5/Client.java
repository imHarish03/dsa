package dsa.pattern.exercise.demo5;

public class Client {
    public static void main(String[] args) {
        ResponseData restApi= new APIProxy(new LegacyAPIConverter(new LegacyAPI()), "1234");
        System.out.println(restApi.getResponseInJSON());
    }
}
