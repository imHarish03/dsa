package dsa.pattern.exercise.demo5;

public class APIProxy implements ResponseData {

    private final ResponseData responseData;
    private final String password;

    public APIProxy(ResponseData responseData, String password) {
        this.responseData = responseData;
        this.password = password;
    }

    @Override
    public String getResponseInJSON() {
        if(this.password.equals("1234")) {
            return responseData.getResponseInJSON();
        }else{
            return "Invalid Password";
        }

    }
}
