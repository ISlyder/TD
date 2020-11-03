package com.example.retrofit

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface GithubService {
    @GET("/users/{user}/repos")
    fun listRepos(@Path("user") user: String?): List<Repo?>?

    @GET("/search/repositories")
    fun searchRepos(@Query("q") query: String?): List<Repo?>?

    companion object {
        const val ENDPOINT = "https://api.github.com"
    }
}