(function (angular) {
    var loginModule = angular.module('sesionModule', ['CrudModule', 'MockModule']);

    loginModule.constant('sesion.context', 'sesion');

    loginModule.constant('sesion.skipMock', true);
	
    loginModule.config(['sesion.context', 'MockModule.urlsProvider','sesion.skipMock', function (context, urlsProvider, skipMock) {
             urlsProvider.registerUrl(context, skipMock);
         }]);
})(window.angular);
