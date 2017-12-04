function CharactersService() {

    return {
        showCharactersList
    };

    function showCharactersList() {
        const vm = this;

        console.log('vm from service', vm);

        return vm;
    }

}

export default CharactersService;