import angular from 'angular';
import angularUiRouter from 'angular-ui-router';

import charactersService from './characters.service';
import charactersListController from './list/characters.list.controller';

import routeConfig from './characters.route';

const MODULE_NAME = './app.characters';
const charactersModule = angular.module(MODULE_NAME, [angularUiRouter]);

charactersModule.factory('CharactersService', charactersService);
charactersModule.controller('CharactersListController', charactersListController);
charactersModule.config(routeConfig);

export default MODULE_NAME;