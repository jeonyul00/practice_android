package com.jeonyul.shoppi_android

import android.content.Context

class AssetLoader {
    fun getJsonString(context: Context, fileName: String): String? {
        // try catch 기반으로 구현되어 있음
        return kotlin.runCatching {
            loadAsset(context, fileName)
        }.getOrNull()
    }

    // context : 앱 전역에서 사용할 수 있는 정보 접근 || 리소스나 데이터베이스 같은 시스템 자원에 접근 가능
    private fun loadAsset(context: Context, fileName: String): String {
        return context.assets.open(fileName).use { inputStream ->
            val size = inputStream.available()
            val bytes = ByteArray(size)
            inputStream.read(bytes)
            String(bytes)

        }
    }
}