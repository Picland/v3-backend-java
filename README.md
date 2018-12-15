# Earth-Backend

[![License][license-image]][license-url]
[![Master Build Status][master-travis-image]][travis-url]
[![Develop Build Status][develop-travis-image]][travis-url]


## Startup

```bash
gradle deploy
cd startup
docker-compose up tomcat
```

open browser
- the home url: `localhost:8090`
- the spring mvc test url: `localhost:8090/api/users/123`

## Docker Build 

```bash
docker-compose build

```

[travis-url]: https://travis-ci.org/G-Explorer/Earth-Backend-Java
[master-travis-image]: https://img.shields.io/travis/G-Explorer/Earth-Backend-Java/master.svg?style=flat-square&label=master-build
[develop-travis-image]: https://img.shields.io/travis/G-Explorer/Earth-Backend-Java/develop.svg?style=flat-square&label=develop-build

[license-url]: https://github.com/G-Explorer/Earth-Backend-Java/blob/master/LICENSE
[license-image]: https://img.shields.io/github/license/G-Explorer/Earth-Backend-Java.svg?style=flat-square
