(function (angular) {
    var eventoVisitaModule = angular.module('eventoVisitaModule', ['CrudModule', 'MockModule','eventoModule','visitaModule']);

    eventoVisitaModule.constant('eventoVisita.context', 'eventoVisita');
    eventoVisitaModule.constant('eventoVisita.skipMock', true);

     eventoVisitaModule.config(['eventoVisita.context', 'MockModule.urlsProvider','eventoVisita.skipMock', function (context, urlsProvider, skipMock) {
             urlsProvider.registerUrl(context, skipMock);
         }]);
})(window.angular);
