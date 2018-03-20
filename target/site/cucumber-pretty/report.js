$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Cal.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 6,
  "name": "Addition Functionality validation",
  "description": "",
  "id": "addition-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@navlogin"
    }
  ]
});
formatter.before({
  "duration": 5129020924,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "validating addition fuctionality with user inputs",
  "description": "",
  "id": "addition-functionality-validation;validating-addition-fuctionality-with-user-inputs",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@navlogin"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "valid inputs",
  "keyword": "Given "
});
formatter.match({
  "location": "AdditionValidation.validInputs()"
});
formatter.result({
  "duration": 6229836821,
  "status": "passed"
});
formatter.after({
  "duration": 620821632,
  "status": "passed"
});
});