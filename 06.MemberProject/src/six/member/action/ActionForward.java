package six.member.action;

public class ActionForward {
  private String nextURL;
  private boolean isForward; // true : forward, false : redirect
  
  public String getNextURL() {
    return nextURL;
  }
  public void setNextURL(String nextURL) {
    this.nextURL = nextURL;
  }
  public boolean isForward() {
    return isForward;
  }
  public void setForward(boolean isForward) {
    this.isForward = isForward;
  }
}
