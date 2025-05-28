docker-compose build
docker-compose -f docker-compose.yml up -d
#stop 3 secounds
sleep 3
#export ennvironment variable to export cucumber report to cloud
export CUCUMBER_PUBLISH_TOKEN=4c40fc5a-8cde-4f94-a913-ed63719150f6
mvn clean install -Dtest=Runner -DbrowserHeadless=true test
mvn clean install -Dtest=Runner_CotasSemTurno -DbrowserHeadless=true test