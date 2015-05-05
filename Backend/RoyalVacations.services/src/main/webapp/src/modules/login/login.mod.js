(function (angular) {
    var loginModule = angular.module('loginModule', ['CrudModule', 'MockModule']);

    loginModule.constant('login.context', 'login');

    loginModule.constant('login.skipMock', true);
	
    loginModule.config(['login.context', 'MockModule.urlsProvider','login.skipMock', function (context, urlsProvider, skipMock) {
             urlsProvider.registerUrl(context, skipMock);
         }]);
})(window.angular);
