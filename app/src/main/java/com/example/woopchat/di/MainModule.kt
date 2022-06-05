package com.example.woopchat.di

import androidx.lifecycle.ViewModel
import com.example.woopchat.MainVimo
import com.example.woopchat.base.BaseVimo
import com.example.woopchat.service.ISocketUseCases
import com.example.woopchat.service.SocketUseCases
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import dagger.multibindings.IntoMap

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class MainModule {
    @Binds
    @ActivityRetainedScoped
    abstract fun provideSocketUseCases(socketUseCases: SocketUseCases): ISocketUseCases
}