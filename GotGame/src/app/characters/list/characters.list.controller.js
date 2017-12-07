function charactersListController(CharactersService) {

    const vm = this;

    console.log('vm from controller', vm);

    CharactersService.showCharactersList();

}

charactersListController.$inject = ['charactersService'];

export default charactersListController;