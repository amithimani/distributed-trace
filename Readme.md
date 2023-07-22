# Distributed Trace Project (distributed-trace)

## Introduction

This Distributed Trace project demonstrates the concept of distributed tracing in Spring Boot using Jaeger and OpenTelemetry. The project consists of two modules, namely `customer-service` and `insurance-service`, both representing microservices that work together to showcase the distributed tracing functionality.

## Project Structure

The project contains the following modules:

1. `customer-service`: This module represents a microservice responsible for handling customer-related requests and interacting with the `insurance-service` to fetch policy and claims details.

2. `insurance-service`: This module is another microservice designed to manage insurance-related data and fulfill requests from the `customer-service`.

## Prerequisites

To run this project, you need the following software installed on your system:

- Java Development Kit (JDK) 17 or higher
- Spring Boot 3.1
- Jaeger
- OpenTelemetry

## Setup and Usage

1. Clone the project from the repository to your local machine:

```
git clone <repository-url>
```

2. Navigate to the root directory of each module (`customer-service` and `insurance-service`) and follow the instructions provided in their respective README files to set up and run the microservices.

3. Ensure that Jaeger and OpenTelemetry are properly configured and running to enable distributed tracing functionality.

4. With both microservices running and tracing enabled, you can now make requests to the `customer-service`, which will interact with the `insurance-service` behind the scenes.

## Distributed Tracing

Distributed tracing allows you to track the flow of requests as they traverse through multiple microservices. Each interaction between services is recorded as a "span," and the collection of all spans involved in processing a single request is known as a "trace."

By utilizing Jaeger and OpenTelemetry in this project, you can monitor and analyze the traces to gain insights into how requests move between the `customer-service` and `insurance-service`, helping you to troubleshoot and optimize the system.

## Conclusion

The Distributed Trace project with its two microservices, `customer-service` and `insurance-service`, demonstrates the power of distributed tracing using Jaeger and OpenTelemetry in Spring Boot applications. 
This project is intended for educational purposes, helping you understand and implement distributed tracing in your own microservice-based projects. If you have any questions or suggestions, feel free to contribute or reach out to the project maintainers. Happy tracing!