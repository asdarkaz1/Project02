const baseUrl = 'http://127.0.0.1:8080'
const updateButtonElement = document.getElementById('udate');
const viewButtonElement = document.getElementById('vbtn');
const deleteButtonElement = document.getElementById('dbtn');

const firstnameinputElement = document.getElementById('fname');
const lastnameinputElement = document.getElementById('lname');
const usernameinputElement = document.getElementById('uname');
const passwordinputElement = document.getElementById('pword');
const emailinputElement = document.getElementById('email');
const interestinputElement = document.getElementById('interest');

updateButtonElement.addEventListener('click', () => {
    console.log(firstnameinputElement.value);
    console.log(lastnameinputElement.value);
    console.log(usernameinputElement.value);
    console.log(passwordinputElement.value);
    console.log(interestinputElement.value);
    console.log(emailinputElement.value);
//Here we are sending the data to the API
    fetch(`http://127.0.0.1:8080/profileupdate`,{
        method: 'POST',
        credentials: 'include',
        body: `{"username": "${usernameinputElement.value}","email": "${emailinputElement.value}","interest": "${interestinputElement.value}",  "firstname":"${firstnameinputElement.value}", "lastname": "${lastnameinputElement.value}","passWord":"${passwordinputElement.value}"}`
    }).then((res) => {
        return res.json();
    }).then((responseBody) => {
        console.log(responseBody)
    });

});

deleteButtonElement.addEventListener('click' , () => {
    fetch(`http://127.0.0.1:8080/profiledelete`,{
        method: 'POST',
        credentials: 'include',
        body: `{"username": "${usernameinputElement.value}","email": "${emailinputElement.value}","interest": "${interestinputElement.value}",  "firstname":"${firstnameinputElement.value}", "lastname": "${lastnameinputElement.value}","passWord":"${passwordinputElement.value}"}`
    }).then((res) => {
        return res.json();
    }).then((responseBody) => {
        console.log(responseBody)
    });
    
    });
    
viewButtonElement.addEventListener('click' , () => {
console.log(passwordinputElement.value);
fetch(`http://127.0.0.1:8080/profileview`,{
    method: 'POST',
    credentials: 'include',
    body: `{"username": "x","email": "x","interest": "x",  "firstname":"x", "lastname": "x","passWord":"${passwordinputElement.value}"}`
}).then((res) => {
    return res.json();
}).then((responseBody) => {
    console.log(responseBody)
});

});

