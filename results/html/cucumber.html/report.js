$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ApiServie.feature");
formatter.feature({
  "line": 2,
  "name": "Execute the API test cases",
  "description": "I want to execute and verify the response for API",
  "id": "execute-the-api-test-cases",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "The base uri is \"https://reqres.in/api\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 8,
  "name": "Verify get request users API",
  "description": "",
  "id": "execute-the-api-test-cases;verify-get-request-users-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user inquires for page \"2\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "status for the reponse should be \"200\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "first name for id \"10\" should be \"Byron\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "The base uri is \"https://reqres.in/api\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Verify the post request user API",
  "description": "",
  "id": "execute-the-api-test-cases;verify-the-post-request-user-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user posts with name \"Bryant\" and job \"BA\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "status code should be \"201\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the id should be generated",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify schema with file \"./src/test/resources/user.json\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("InteractionTest.feature");
formatter.feature({
  "line": 1,
  "name": "Execute the Web test cases of Interaction menu for jquery UI",
  "description": "",
  "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on \"https://jqueryui.com/\" url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 6,
  "name": "Verify Droppable from left menu under Interactions",
  "description": "",
  "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-droppable-from-left-menu-under-interactions",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user selected \u0027Interactions\u0027 form left menu",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on droppable under interaction from left menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user drag \u0027Drag me to my target\u0027 component to \u0027drop here\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "component should place in inbox",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Verify Selectable from left menu under Interactions",
  "description": "",
  "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "user click on selectable from left menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user select the items \"\u003cselect\u003e\" from table",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "item \"\u003cselect\u003e\" should get selected",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions;",
  "rows": [
    {
      "cells": [
        "select"
      ],
      "line": 17,
      "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions;;1"
    },
    {
      "cells": [
        "Item 1"
      ],
      "line": 18,
      "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions;;2"
    },
    {
      "cells": [
        "Item 3"
      ],
      "line": 19,
      "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions;;3"
    },
    {
      "cells": [
        "Item 7"
      ],
      "line": 20,
      "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on \"https://jqueryui.com/\" url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Verify Selectable from left menu under Interactions",
  "description": "",
  "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "user click on selectable from left menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user select the items \"Item 1\" from table",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "item \"Item 1\" should get selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on \"https://jqueryui.com/\" url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "Verify Selectable from left menu under Interactions",
  "description": "",
  "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "user click on selectable from left menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user select the items \"Item 3\" from table",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "item \"Item 3\" should get selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on \"https://jqueryui.com/\" url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "Verify Selectable from left menu under Interactions",
  "description": "",
  "id": "execute-the-web-test-cases-of-interaction-menu-for-jquery-ui;verify-selectable-from-left-menu-under-interactions;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "user click on selectable from left menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user select the items \"Item 7\" from table",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "item \"Item 7\" should get selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("WidgetsTest.feature");
formatter.feature({
  "line": 1,
  "name": "Execute the Web test cases of Widget menu for jquery UI",
  "description": "",
  "id": "execute-the-web-test-cases-of-widget-menu-for-jquery-ui",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on \"https://jqueryui.com/\" url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 6,
  "name": "Verify control group and perform actions on widget menu from left menu",
  "description": "",
  "id": "execute-the-web-test-cases-of-widget-menu-for-jquery-ui;verify-control-group-and-perform-actions-on-widget-menu-from-left-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user navigate to Control group link from left menu",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user on control page frame for horizontal care rental options",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user can select \"SUV\" from drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user can select \"Automatic\" radio button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can select the \"insurance\" check box",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user can give the number \"2\" for car input",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user on vertical car rental menu options",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user can select \"Truck\" option from select menu",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user should be able to select \"standard\" radio button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user can check \"insurance\" checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user can put the \"1\" number of cars",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});