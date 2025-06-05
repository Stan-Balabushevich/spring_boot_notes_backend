package com.slavant.testspringboot.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class StatusController {

    @GetMapping
    fun getStatus(): String {
        return "In this video, you'll learn how you can deploy a JAR-based backend (Spring Boot, Ktor, etc.) to a self-hosted VPS instance from Hetzner for just 3\$/month. \n" +
                "I'll walk you through creating the VPS instance, connecting to it via SSH, securing it via a custom user account, setting up and running a systemd service," +
                " setting up Nginx as a reverse-proxy with our " +
                "own SSL certificate and custom domain and lastly how we can automate this deployment via a GitHub Actions pipeline when pushing to the master branch."
    }
}