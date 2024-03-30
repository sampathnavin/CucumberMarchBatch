Feature: Login Validation 
Scenario: Valid User Name and Password Validation
Given A user tries to launch the browser 
When Validate whether user can able to open URL 
Then Validate whether user can enter valid username and password
And User tries to login by clicking the login button 
Then Validate whether user can able to Login Successfully 
And After Successfull validation close the browser 
