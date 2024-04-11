package dev.prateekthakur.camera.domain.repository

import androidx.camera.view.LifecycleCameraController

/**
 * @author Prateek Thakur
 */
interface BaseCameraRepository {
    suspend fun takePhoto(
        controller: LifecycleCameraController
    )

    suspend fun recordVideo(
        controller: LifecycleCameraController
    )
}