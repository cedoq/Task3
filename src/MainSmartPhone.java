public class MainSmartPhone<model, OS> {

 private String os;
 private String model;
 private String companyName;

 public void powerDown(){
  System.out.println("died XD");

 }

 public void powerUp(){
  System.out.println("* ON *");

 }
 public String getOs() {
  return os;
 }

 public void setOs(String os) {
  this.os = os;
 }

 public String getModel() {
  return model;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public String getCompanyName() {
  return companyName;
 }

 public void setCompanyName(String companyName) {
  this.companyName = companyName;
 }
 public void Ringtone(){
  System.out.println("drin-drin");

 }
 public void die(String company){
  company = companyName;
  if(company == "apple"){
   System.out.println("weather is too cold for me ");
   this.powerDown();
  }
  else if(company == "Huawei"){
   System.out.println("u using me for 2 years i'll die now");
   this.powerDown();
   System.out.println("*Totally*");
  }

 }
public void Showstatus(){

 System.out.println("Phone model: " + model + "; OS: " + os + "; Company: " +  companyName);
}
}