package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url '/account/12345'
    }

    response {
        status 200
        body([
                id: '12345',
                type: 'friends'
        ])
    }
}
