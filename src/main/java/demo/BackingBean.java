package demo;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class BackingBean implements Serializable {

  private static final Logger log = Logger.getLogger("BackingBean");

  private String firstName = "Joe";
  private String job;
  private String startDate;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public void doIt() {
    log.info(String.format("First Name %s, Job %s, Start Date %s", firstName, job, startDate));
  }
}
