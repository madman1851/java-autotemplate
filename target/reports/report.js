$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Cukes/Tests.feature");
formatter.feature({
  "line": 1,
  "name": "Old tests",
  "description": "",
  "id": "old-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#  Scenario: Smoke test 1"
    },
    {
      "line": 3,
      "value": "#    Given I can connect to server"
    },
    {
      "line": 4,
      "value": "#    When I start process"
    },
    {
      "line": 5,
      "value": "#    Then I files are created"
    }
  ],
  "line": 7,
  "name": "IPMRStest",
  "description": "",
  "id": "old-tests;ipmrstest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "All connections to server are established",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "\"\" job is present",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I run the \"\" job",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Results are present",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.all_connections_to_server_are_established()"
});
formatter.result({
  "duration": 104088739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 1
    }
  ],
  "location": "Test.job_is_present(String)"
});
formatter.result({
  "duration": 3030149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    }
  ],
  "location": "Test.i_run_the_job(String)"
});
formatter.result({
  "duration": 66559,
  "status": "passed"
});
formatter.match({
  "location": "Test.results_are_present()"
});
formatter.result({
  "duration": 22187,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "KOMDAVtest",
  "description": "",
  "id": "old-tests;komdavtest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "All connections to server are established",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "\"\" job is present",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I run the \"\" job",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Results are present",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.all_connections_to_server_are_established()"
});
formatter.result({
  "duration": 203944,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 1
    }
  ],
  "location": "Test.job_is_present(String)"
});
formatter.result({
  "duration": 70826,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    }
  ],
  "location": "Test.i_run_the_job(String)"
});
formatter.result({
  "duration": 67839,
  "status": "passed"
});
formatter.match({
  "location": "Test.results_are_present()"
});
formatter.result({
  "duration": 37120,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "JSONSend",
  "description": "",
  "id": "old-tests;jsonsend",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "All connections to server are established",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "\"\" job is present",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I run the \"\" job",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Results are present",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.all_connections_to_server_are_established()"
});
formatter.result({
  "duration": 135252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 1
    }
  ],
  "location": "Test.job_is_present(String)"
});
formatter.result({
  "duration": 71252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    }
  ],
  "location": "Test.i_run_the_job(String)"
});
formatter.result({
  "duration": 67839,
  "status": "passed"
});
formatter.match({
  "location": "Test.results_are_present()"
});
formatter.result({
  "duration": 29013,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 28,
      "value": "#Different scenario - needs new test steps"
    }
  ],
  "line": 29,
  "name": "csvtoexcel",
  "description": "",
  "id": "old-tests;csvtoexcel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "All connections to server are established",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "\"\" database is connected",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "\"\" job is present",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I run the \"\" job",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Results are present",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.all_connections_to_server_are_established()"
});
formatter.result({
  "duration": 159145,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 1
    }
  ],
  "location": "Test.job_is_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    }
  ],
  "location": "Test.i_run_the_job(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Test.results_are_present()"
});
formatter.result({
  "status": "skipped"
});
});