compose:
	docker-compose up --build -d --remove-orphans

docker.intranet.registry.build:
	docker build --no-cache -t idesoft.local:32000/idesoft/hellok8s:0.2 .

docker.intranet.registry.publish:
	docker push idesoft.local:32000/idesoft/hellok8s:0.2
