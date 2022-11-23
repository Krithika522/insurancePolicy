<!DOCTYPE html>
<html lang=”en”>
<head>
<title></title>
<script src="https://cpwebassets.codepen.io/assets/common/stopExecutionOnTimeout-1b93190375e9ccc259df3a57c1abc0e64599724ae30d7ea4c6877eb615f89387.js"></script>
</head>

<body>

<h1>HTML Form for email </h1>

<form method="post" action="/index" id="form" class="validate">
  <div class="form-field">
    <label for="full-name">Full Name</label>
    <input type="text" name="full-name" id="full-name" placeholder="Joe Bloggs" required />
  </div>
  <div class="form-field">
    <label for="email-input">Email</label>
    <input type="email" name="email-input" id="email-input" placeholder="example@domain.com" required />
  </div>
  <div class="form-field">
    <label for="password-input">Password</label>
    <input type="password" name="password-input" id="password-input" required />
  </div>
  <div class="form-field">
    <label for=""></label>

    <input type="submit" value="Sign Up" />


  </div>
</form>
 </body>