#!/bin/bash
while ! `nc -z $CONFIG_SERVER $CONFIG_SERVER_PORT`;
    do sleep $SLEEP_TIME; echo "Waiting for $CONFIG_SERVER";done
while ! `nc -z $DISCOVERY_SERVER $DISCOVERY_SERVER_PORT`;
    do sleep $SLEEP_TIME; echo "Waiting for $DISCOVERY_SERVER";done
while ! `nc -z $USER_DB $USER_DB_PORT`;
    do sleep $SLEEP_TIME; echo "Waiting for $USER_DB";done
java -jar user-service.jar