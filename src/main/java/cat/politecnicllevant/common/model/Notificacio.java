package cat.politecnicllevant.common.model;

public class Notificacio {

    private NotificacioTipus notifyType;
    private String notifyMessage;

    private Boolean redirectToLogin;

    public Notificacio() {
    }

    public NotificacioTipus getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(NotificacioTipus notifyType) {
        this.notifyType = notifyType;
    }

    public String getNotifyMessage() {
        return notifyMessage;
    }

    public void setNotifyMessage(String notifyMessage) {
        this.notifyMessage = notifyMessage;
    }

    public Boolean getRedirectToLogin() {
        if(redirectToLogin==null){
            return false;
        }
        return redirectToLogin;
    }

    public void setRedirectToLogin(Boolean redirectToLogin) {
        this.redirectToLogin = redirectToLogin;
    }
}
