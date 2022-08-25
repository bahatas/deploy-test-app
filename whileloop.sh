#!/bin/bash

#counter=0
#
#until [ $counter -gt 5 ]
#do
#  echo Counter: $counter
#  ((counter++))
#done;

#until [ \
#  "$(curl -s -w '%{http_code}' -o /dev/null "https://deploy-test-image-t5fdrk6htq-nw.a.run.app")" \
#  -eq 200 ]
#do
#  sleep 5
#done

until $(curl --output /dev/null --silent --head --fail http://localhost:9000/api/hello); do
    printf '.'
    sleep 5
done