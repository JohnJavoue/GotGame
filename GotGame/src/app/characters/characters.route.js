import charactersTemplate from './characters.template.html';
import charactersListTemplate from './list/characters.list.template.html';

const routeConfigs = function($stateProvider, $urlRouterProvider){

    $stateProvider
        .state('characters', {
            url: '/characters',
            template: charactersTemplate,
            abstract: true
        })
        .state('characters.list', {
            url: '/list',
            template: charactersListTemplate,
            controller: 'charactersListController',
            controllerAs: 'vm'
        });

    $urlRouterProvider.otherwise('/characters/list')
};

export default routeConfigs;
