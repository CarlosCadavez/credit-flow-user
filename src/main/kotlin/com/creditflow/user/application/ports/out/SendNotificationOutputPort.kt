package com.creditflow.user.application.ports.out

import com.creditflow.user.application.core.domain.CreateCustomerNotification

interface SendNotificationOutputPort {

    fun send(createCustomerNotification: CreateCustomerNotification)
}