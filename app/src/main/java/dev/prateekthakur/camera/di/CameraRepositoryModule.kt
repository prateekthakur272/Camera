package dev.prateekthakur.camera.di

import dev.prateekthakur.camera.data.repository.CameraRepository
import dev.prateekthakur.camera.domain.repository.BaseCameraRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Ahmed Guedmioui
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class CameraRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCameraRepository(
        cameraRepository: CameraRepository
    ): BaseCameraRepository
}