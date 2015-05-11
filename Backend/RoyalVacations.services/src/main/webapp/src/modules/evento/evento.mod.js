(function (angular) {
    var eventoModule = angular.module('eventoModule', ['CrudModule', 'MockModule','ciudadModule']);

    eventoModule.constant('evento.context', 'evento');
    eventoModule.constant('evento.skipMock', true);

     eventoModule.config(['evento.context', 'MockModule.urlsProvider','evento.skipMock', function (context, urlsProvider, skipMock) {
             urlsProvider.registerUrl(context, skipMock);
         }]);
})(window.angular);
