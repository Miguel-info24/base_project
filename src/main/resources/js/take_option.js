function takeOption(userType) {
    localStorage.setItem('user-type', userType);
    console.log('User type:', userType);
    window.location.href = '/Views/login.html';
}