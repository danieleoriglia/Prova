function registration(){
    var name = document.getElementById('name').value;
    var surname = document.getElementById('surname').value;
    var email = document.getElementById('email').value;
    var password = document.getElementById('password').value;
	var username = document.getElementById('username').value;
	var affilation = document.getElementById('affilation').value;
	var date = document.getElementById('date').value;
  //  var consensoDati = document.getElementById('consensoDati').value;
    
    if (name.trim() == '' || surname.trim() == '' || email.trim() == '' || password.trim() == '' || username.trim() == '' || affilation.trim() == '' || date.trim() == ''){
        alert('you have to complete all the fields');
	return false;}
    //controllo mail
    if (testEmailAddress(email) == false){
               alert('the mail is not valid');
	return false;}
	//password almeno di 8 caratteri
	if (password.length <= 7){
		alert('the password should have at least 8 characters');
		return false;}
    //controllo checkbox                      
   /* if (document.getElementById('consensoDati').checked == false)  {
        alert('Il consenso per l\'utilizzo dei dati personali non e\' stato dato');
        return false;}*/
	if (date.length != 8 || !(date.indexOf("/") == 2 && date.lastIndexOf("/") == 5)){
		alert('the date must have this format DD/MM/YY');
		return false;}
    return true;
}

    function login(){
		var username = document.getElementById('username').value;
		var password = document.getElementById('password').value;
		
		if (username.trim() == '' || password.trim() == ''){
			alert('Non tutti i campi di testo sono stati inseriti');
	return false;}
	//password almeno di 8 caratteri
	if (password.length <= 7){
		alert('the password should have at least 8 characters');
		return false;}
	return true;
	}
    function popo(){
    	alert('daiiiiii');
    	return false;
    }
    function testEmailAddress(emailToTest) {
        var atSymbol = emailToTest.indexOf("@");
        if(atSymbol < 1) return false;
        var dot = emailToTest.indexOf(".");
        if(dot <= atSymbol + 2 && dot > atSymbol) return false;
        if (dot == emailToTest.length - 1) return false;
        return true;
    }
    
    
	