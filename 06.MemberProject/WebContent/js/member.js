/**
 * 
 */

// ajax
function createXMLHttpRequest(){
  if(window.ActiveXObject){
    xhr=new ActiveXObject("Microsoft.XMLHTTP");
  }else{
    xhr=new XMLHttpRequest();
  }
  return xhr;
}

function checkId(){
  var id = document.registerForm.id.value;
  var idPattern = new RegExp('[^a-zA-Z0-9_]'); //아이디정규식(a-z A-Z 0-9 _)체크
  if(id==""){
    alert("아이디를 입력하세요.");
    document.registerForm.id.focus();
    return false;
  }
  if(id.length < 3 || idPattern.test(id)){
    document.getElementById("idcheck").innerHTML="4글자 이상, 아이디는 영문자와 숫자, '_'";
    document.registerForm.id.value="";
    document.registerForm.id.focus();
    return false;
  }
  xhr=createXMLHttpRequest();
  xhr.onreadystatechange=checkIdShowResult;
  xhr.open("get","/06.MemberProject/checkId.six?id="+id, true);
  xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded;charset=euc-kr');
  xhr.send(null);
}
function checkIdShowResult(){
  if(xhr.readyState==4){
    if(xhr.status==200){
    var flag = xhr.responseText;
    //alert("flag"+flag);
      if(flag == "true"){
        document.getElementById("idcheck").innerHTML="사용불가";
        document.registerForm.id.value="";
        document.registerForm.id.focus();
      }else{
        document.getElementById("idcheck").innerHTML="사용가능";
        document.registerForm.pwd.focus();
      }
    }
  }
}

function registerCheck(){
  // id 입력 되었는지 확인
  var idText = document.registerForm.id;
  if(id.value == "") {
    alert("아이디를 입력해주세요");
    idText.value="";
    idText.focus();
    return false; 
  }
  
  // id가 정규식에 포함되었는지 확인
  var idPattern = new RegExp('[^a-zA-Z0-9_]'); //아이디정규식(a-z A-Z 0-9 _)체크
  if(idText.value.length < 3 || idPattern.test(idText.value))
  {
    alert("아이디를 영문자와 숫자, '_'이고, 4글자 이상 입력해주세요.");
    idText.value="";
    idText.focus();
    return false; 
  }
  

}