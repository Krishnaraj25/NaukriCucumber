$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Naukri.feature");
formatter.feature({
  "name": "Naukri feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Naukri Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch the Naukri Application",
  "keyword": "Given "
});
formatter.match({
  "location": "NaukriLogin.user_Launch_the_Naukri_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Login the Naukri Application",
  "keyword": "When "
});
formatter.match({
  "location": "NaukriLogin.user_Login_the_Naukri_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Search and Select the Job",
  "keyword": "And "
});
formatter.match({
  "location": "NaukriLogin.user_Search_and_Select_the_Job()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get the jobs",
  "keyword": "And "
});
formatter.match({
  "location": "NaukriLogin.user_get_the_jobs()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});