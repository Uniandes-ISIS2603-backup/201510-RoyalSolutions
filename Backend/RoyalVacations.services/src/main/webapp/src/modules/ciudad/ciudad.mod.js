(function (angular) {
    var ciudadModule = angular.module('ciudadModule', ['CrudModule', 'MockModule','paisModule']);

    ciudadModule.constant('ciudad.context', 'ciudad');
    ciudadModule.constant('ciudad.skipMock', true);

     ciudadModule.config(['ciudad.context', 'MockModule.urlsProvider','ciudad.skipMock', function (context, urlsProvider, skipMock) {
             urlsProvider.registerUrl(context, skipMock);
         }]);
})(window.angular);
