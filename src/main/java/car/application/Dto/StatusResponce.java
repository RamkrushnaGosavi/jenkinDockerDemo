package car.application.Dto;

public class StatusResponce {

    public int code;

    public String msg;

    public String status;


    public StatusResponce(int code, String msg, String status) {
        this.code = code;
        this.msg = msg;
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusResponce{" +
                "StatusCode=" + code +
                ", msg='" + msg + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
