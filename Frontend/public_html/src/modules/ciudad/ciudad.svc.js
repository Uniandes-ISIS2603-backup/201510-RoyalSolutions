(function(){
    var ciudadModule = angular.module('ciudadModule');
    
    ciudadModule.service('ciudadService', ['CRUDBase','ciudad.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
            this.getMostPopulated = function(){
                return this.api.customGET('mostPopulated');
            };
            this.getLeastPopulated = function(){
                return this.api.customGET('leastPopulated');
            };
    }]);
})();
