FROM mysql:5.7

# Copy the database initialize script:
# Contents of /docker-entrypoint-initdb.d are run on mysqld startup
COPY docker-entrypoint-initdb.d/initialize_db.sql /docker-entrypoint-initdb.d/initialize_db.sql
RUN chmod +x ./docker-entrypoint-initdb.d/initialize_db.sql

# Default values for passwords and database name. Can be overridden on docker run
ENV MYSQL_DATABASE=earth-development
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=pwd