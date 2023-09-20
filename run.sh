#!/usr/bin/env bash

## Cleanup if there's already running app
db_id=$(docker ps --format "{{.ID}}" --filter name=db)
app_id=$(docker ps --format "{{.ID}}" --filter name=employee-management)
storage_id=$(docker volume ls --format "{{.Name}}" --filter name=employee-management_db-vol)

if [ "$app_id" ]
  then
    docker container rm "$app_id" -f
fi

if [ "$db_id" ]
  then
    docker container rm "$db_id" -f
fi

if [ "$storage_id" ]
  then
   docker volume rm employee-management_db-vol -f
fi

### Starting

### Running db before the spring
docker compose up -d db
sleep 2

### Starting Spring
docker compose up -d employee-management