# Get started
## How to run
1. clean install **required*
2. run
3. sample curl
```
curl --location --request POST 'http://localhost:8890/v1/pay' \
--header 'Content-Type: application/json' \
--data-raw '{
    "externalId":"abc123",
    "amount":{
        "currency":"IDR",
        "value":8000
    }
}'
```

## Note
You need to compile first if you make a change at mapper. 
Because mapstruct is type safe. So the mapstruct will generate the code into target (the code same like native)