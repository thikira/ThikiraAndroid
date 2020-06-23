package com.example.di

import com.example.model.repository.AccountRepository
import com.example.model.repository.AuthRepository
import com.example.repository.AccountRepositoryImpl
import com.example.repository.AuthRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory<AuthRepository> { AuthRepositoryImpl(get(), get()) }
    factory<AccountRepository> { AccountRepositoryImpl(get()) }
}