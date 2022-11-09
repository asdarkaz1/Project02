let postForm = document.querySelector('#container');
let createNewPostBtn = document.querySelector('#cnBtn');

function showPostForm() {
    postForm.style.visibility = "";
    createNewPostBtn.style.visibility = "hidden";
}

createNewPostBtn.addEventListener('click', showPostForm);