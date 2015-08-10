package six.member.dto;

import java.util.Date;

public class Member {
  private String id;
  private String pwd;
  private String name;
  private int age;
  private String gender;
  private String addr;
  private Date regdate;
  
  public Member(){}
  
  public Member(String id, String pwd, String name, int age, String gender, String addr){
    this.id = id;
    this.pwd = pwd;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.addr = addr;    
  }
  
  public Member(String id, String name, String gender, Date regdate){
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.regdate = regdate;
  }
  
  public Member(String id, String name, int age, String gender, String addr){
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.addr = addr;    
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public Date getRegdate() {
    return regdate;
  }

  public void setRegdate(Date regdate) {
    this.regdate = regdate;
  }
  
  
}
