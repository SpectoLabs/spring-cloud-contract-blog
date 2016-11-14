package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url value(consumer(regex('/account/[0-9]{5}')), producer('/account/12345'))
    }

    response {
        status 200
        body([
                type: 'friends',
                email: 'tom@api.io'
        ])
        headers {
            header('Content-Type': value(
                    producer(regex('application/json.*')),
                    consumer('application/json')
            ))
        }
    }
}
