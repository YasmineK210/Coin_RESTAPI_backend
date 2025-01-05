# Coin REST API Backend

## Project Description
A program to output the minimum coins to make up the input value.
- Rest API is written using Java Spring Boot, returns JSON data of the coin array
- Deployed using GKE (Google Kubernetes Engine)

## Deployed website
Visit http://34.143.176.134/api/coin?input=...
Please specify the value of the input query parameter (Ex: http://34.143.176.134/api/coin?input=198.2)
NB: Due to limited credit, the website might be close in a month.

## Issues in project
When add the JUnit test file (CoinTest.java, located in the test folder), it cannot produce .JAR file after maven clean install, which is necessary for the dockerization.
You can just run `docker-compose build` and `docker-compose up` since it has been built beforehand.
But in case it doesn't work, please move the JUnit test file somewhere and copy back if you want to do unit testing!

## How to run locally
1. Git clone this repository: `git clone https://github.com/YasmineK210/Coin_RESTAPI_backend.git`
2. `cd Coin_RESTAPI_backend`
3. Run: `docker-compose build`
4. Run: `docker-compose up`
5. Server should be running on localhost 8080
