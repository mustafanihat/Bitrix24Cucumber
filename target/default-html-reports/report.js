$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SpartanApi.feature");
formatter.feature({
  "name": "Spartan test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Api get test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User send a get request to spartan api",
  "keyword": "Given "
});
formatter.match({
  "location": "SpartanStepdefs.user_send_a_get_request_to_spartan_api()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "result should be \"abuzer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SpartanStepdefs.result_should_be(String)"
});
formatter.result({
  "status": "passed"
});
});