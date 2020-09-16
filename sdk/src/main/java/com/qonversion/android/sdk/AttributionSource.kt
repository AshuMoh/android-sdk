package com.qonversion.android.sdk.attribution

enum class AttributionSource(val id: String) {
    APPSFLYER("appsflyer"),
    UNKNOWN("unknown")

    companion object {
        fun fromValue(val value: String) {
            if (value == APPSFLYER) {
                return APPSFLYER
            }

            return UNKNOWN
        }
    }
}