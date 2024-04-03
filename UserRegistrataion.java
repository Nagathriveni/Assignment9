<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration Form</title>
</head>
<body>

<h2>Sign up</h2>

<form action="/submit_form" method="post" enctype="multipart/form-data">
    <label for="full-name">Full Name:</label><br>
    <input type="text" id="full-name" name="fullname" placeholder="Full Name" required maxlength="100"><br><br>

    <label for="email">Email Address:</label><br>
    <input type="email" id="email" name="email" placeholder="Email Address" required maxlength="100"><br><br>

    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password" placeholder="Password" required minlength="8" maxlength="20"><br><br>

    <label for="confirm-password">Confirm Password:</label><br>
    <input type="password" id="confirm-password" name="confirmpassword" placeholder="Confirm Password" required minlength="8" maxlength="20"><br><br>

    <label for="dob">Date of Birth:</label><br>
    <input type="date" id="dob" name="dob" required><br><br>

    <label>Gender:</label><br>
    <input type="radio" id="male" name="gender" value="male">
    <label for="male">Male</label><br>
    <input type="radio" id="female" name="gender" value="female">
    <label for="female">Female</label><br>
    <input type="radio" id="other" name="gender" value="other">
    <label for="other">Other</label><br><br>

    <label for="photo">Upload Photo:</label><br>
    <input type="file" id="photo" name="photo" accept="image/*"><br><br>

    <label for="resume">Upload Resume:</label><br>
    <input type="file" id="resume" name="resume" accept=".pdf,.doc,.docx"><br><br>

    <label for="security-question">Security Question:</label><br>
    <select id="security-question" name="securityquestion">
        <option value="pet">What is your birthday date?</option>
        <option value="mother">What is your favourite food?</option>
        <option value="birth">What city were you born in?</option>
    </select><br><br>

    <input type="checkbox" id="terms" name="terms" required>
    <label for="terms">I agree to the terms and conditions</label><br><br>

    <input type="submit" value="Register">
</form>

</body>
</html>
